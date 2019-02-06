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

(defn prepare-entity-listener [world entity-id action url] {
    :world world
    :entity-id entity-id
    :action action
    :action-url url
  })

(defn save-entity-listener [world entity-id action url]
  (client/post
    "http://localhost:3000/entities/add-entity-listener"
    {
      :form-params (prepare-entity-listener world entity-id action url)
      :content-type :json
      :as :json-strict
      }
    )
  )
