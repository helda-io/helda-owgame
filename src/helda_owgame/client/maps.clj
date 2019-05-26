(ns helda-owgame.client.maps
  (:require
    [helda-owgame.client.entities :refer [save-entity]]
    )
  )

(defn init-room-map [id descr legend backgrounds & tiles] {
  :description descr
  :attrs {
    :name id
    :legend legend
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
  (save-entity world :helda.RoomMap room-map)
  )
