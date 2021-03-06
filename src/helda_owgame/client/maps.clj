(ns helda-owgame.client.maps
  (:require
    [helda-owgame.client.entities :refer [find-entities save-entity]]
    )
  )

;todo introduce legend as separated object

(defn init-room-map [id descr legend-id backgrounds & tiles] {
  :description descr
  :attrs {
    :name id
    :legend-id legend-id
    :backgrounds backgrounds
    :tiles tiles
    :geo-objects []
    }
  :tags [id]
  :actions {}
  })

(defn add-geo-object [target-map geo]
  (update-in target-map [:attrs :geo-objects] conj geo)
  )

(defn save-room-map [room-map world]
  (save-entity world "helda.RoomMap"
    (if-let [entity (first
      (find-entities world ["helda.RoomMap"] [(-> room-map :tags first)])
      )]
      (assoc room-map :id (:id entity))
      room-map
      )
    )
  )
