(ns helda-owgame.client.entities
  (:require
    [clj-http.client :as client]
    )
  )

(defn read [resp]
  (:body resp)
  )

(defn find-entities
  ([world]
    (read
      (client/get
        "http://localhost:3000/entities/entities-by-world"
        {
          :query-params {:world world}
          :content-type :json
          :as :json-strict
          }
        )
      )
    )
  ([world models]
    (read
      (client/get
        "http://localhost:3000/entities/entities-by-models"
        {
          :query-params {:world world :models models}
          :content-type :json
          :as :json-strict
          }
        )
      )
    )
  ([world models tags]
    (read
      (client/get
        "http://localhost:3000/entities/entities-by-tags-and-models"
        {
          :query-params {:world world :models models :tags tags}
          :content-type :json
          :as :json-strict
          }
        )
      )
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
