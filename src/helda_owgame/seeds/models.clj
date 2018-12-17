(ns helda-owgame.seeds.models
  (:require
    [helda-owgame.client.models :refer [save-model]]
    )
  )

(defn seed-models []
  (save-model {
    :package "owgame"
    :name "GeoObject"
    :description "Base class for geo objects"
    :attrs {
      :name "String"
      :x "Int"
      :y "Int"
      :d "Int"
      }
    :extends []
    :actions {}
    })
  )
