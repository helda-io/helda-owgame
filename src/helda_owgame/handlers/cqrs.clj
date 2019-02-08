(ns helda-owgame.handlers.cqrs
  (:require
    [kekkonen.cqrs :refer :all]
    [plumbing.core :refer [defnk]]
    [helda-owgame.handlers.schema :as s]
    )
  )

(defn calculate-dmg [from to]
  (let [
    attack-chk (-> from :attrs :attack-chk read-string)
    target-hp (-> to :attrs :hp)
    ]
    (println "Attack chk " attack-chk)
    (println "Target HP " target-hp)
    ;logic is very simple here
    (assoc-in to [:attrs :hp] (- target-hp attack-chk))
    )
  )

(defnk ^:command fight
  "Fight action"
  {:responses {:default {:schema s/ActionResponse}}}
  [
    [:clients models worlds entities]
    data :- s/ActionEvent
    ]
  (let [
    source (:source-entity data)
    target (:target-entity data)
    action-ctx (:action-ctx data)
    ]
    (println "source " source)
    (println "target " target)
    (println "action-ctx " action-ctx)

    (success {
      :action-ctx {
        :target (calculate-dmg source target)
        }
      :reasoning-msg "Monster wounded!"
      })
    )
  )

(defn create [system]
  (cqrs-api
    {:swagger {:ui "/"
               :spec "/swagger.json"
               :data {:info {:title "Helda API"
                             :description "created with http://kekkonen.io"}}}

     :core {
       :handlers {
        :hooks [#'fight]
       }
       :context system
      }
     }
    )
  )
