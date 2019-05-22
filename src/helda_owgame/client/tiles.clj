(ns helda-owgame.client.tiles
  (:require
    [helda-owgame.client.entities :refer [save-entity]]
    )
  )

(def tiles-world "owgame1")

(defn single-tile [id descr file-id x y]
  (save-entity tiles-world :helda.SingleTile {
    :description descr
    :attrs {
      :compId id
      :fileId file-id
      :x x
      :y y
      }
    :tags [id]
    :actions {}
    })
  )
