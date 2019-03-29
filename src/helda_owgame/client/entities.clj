(ns helda-owgame.client.entities
  (:require
    [clj-http.client :as client]
    )
  )

(defn prepare-entity [world model entity]
  (cond-> entity
    true (assoc :world (name world))
    true (assoc :model (name model))
    (-> entity :tags nil?) (assoc :tags [])
    )
  )

(defn save-entity [world model entity]
  (client/post
    "http://localhost:3000/entities/save-entity"
    {
      :form-params (prepare-entity world model entity)
      :content-type :json
      :as :json-strict
      }
    )
  )
