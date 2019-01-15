(ns helda-owgame.handlers.core
  (:require
    [kekkonen.cqrs :refer :all]
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
  ;todo add-entity
  (success
    (storage/save-entity entities-storage data)
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
        :actions [#'fight]
       }
       :context system
      }
     }
    )
  )
