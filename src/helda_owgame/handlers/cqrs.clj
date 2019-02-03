(ns helda-owgame.handlers.cqrs
  (:require
    [kekkonen.cqrs :refer :all]
    [plumbing.core :refer [defnk]]
    [helda-owgame.handlers.schema :as s]
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

    (success {:action-ctx {}})
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
