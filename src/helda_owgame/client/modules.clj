(ns helda-owgame.client.modules
  (:require
    [clj-http.client :as client]
    )
  )

(defn save-module [module-id url description]
  (client/post
    "http://localhost:3000/modules/save-module"
    {
      :form-params {
        :module-id module-id
        :url url
        :description description
      }
      :content-type :json
      }
    )
  )
