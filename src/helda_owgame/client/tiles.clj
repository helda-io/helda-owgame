(ns helda-owgame.client.tiles
  (:require
    [helda-owgame.client.entities :refer [save-entity]]
    )
  )

(def tiles-world "owgame1")

(defn single-tile
  ([type id descr file-id x y]
    (save-entity tiles-world type {
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
  ([id descr file-id x y]
    (single-tile :helda.SingleTile id descr file-id x y)
    )
  )

(defn foreground-tile [id descr file-id x y]
  (single-tile :helda.ForegroundTile id descr file-id x y)
  )
