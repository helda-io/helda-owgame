(ns helda-owgame.client.models
  (:require
    [clj-http.client :as client]
    )
  )

(defn prepare-model [package model-name model]
  (cond-> model
    true (assoc :full-name (str (name package) "." (name model-name)))
    true (assoc :package (name package))
    true (assoc :name (name model-name))
    (-> model :extends nil?) (assoc :extends [])
    (-> model :actions nil?) (assoc :actions {})
    )
  )

(defn save-model [package name model]
  (client/post
    "http://localhost:3000/models/save-model"
    {
      :form-params (prepare-model package name model)
      :content-type :json
      }
    )
  )

(defn prepare-model-listener [world model action url] {
    :world world
    :model model
    :action action
    :action-url url
  })

(defn save-model-listener [world model action url]
  (client/post
    "http://localhost:3000/models/add-model-listener"
    {
      :form-params (prepare-model-listener world model action url)
      :content-type :json
      }
    )
  )
