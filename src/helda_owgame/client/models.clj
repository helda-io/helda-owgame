(ns helda-owgame.client.models
  (:require
    [clj-http.client :as client]
    )
  )

(defn save-model [model]
  (client/post
    "http://localhost:3000/models/add-model"
    {
      :form-params (assoc model :full-name (str (:package model) (:name model)))
      :content-type :json
      }
    )
  )
