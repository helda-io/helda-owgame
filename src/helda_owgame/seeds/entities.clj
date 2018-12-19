(ns helda-owgame.seeds.entities
  (:require
    [helda-owgame.client.entities :refer [save-entity]]
    )
  )

(defn seed-entities [world]
    (save-entity world :owgame.GeoObject {
      :description "Obstacle 1"
      :attrs {
        :x 100
        :y 200
        :d 3
      }
      })
  )
