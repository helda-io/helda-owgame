(ns helda-owgame.client.tiles
  (:require
    [helda-owgame.client.entities :refer [find-entities save-entity]]
    )
  )

(def tiles-world "owgame1")

(defn insert-or-update [new-entity model]
  (save-entity tiles-world model
    (if-let [entity (first
      (find-entities tiles-world [model] [(-> new-entity :tags first)])
      )]
      (assoc new-entity :id (:id entity))
      new-entity
      )
    )
  )

(defn single-tile
  ([model id descr file-id x y]
    (insert-or-update {
      :description descr
      :attrs {
        :compId id
        :fileId file-id
        :x x
        :y y
        }
      :tags [id]
      :actions {}
      }
      model
      )
    )
  ([id descr file-id x y]
    (single-tile "helda.SingleTile" id descr file-id x y)
    )
  )

(defn foreground-tile [id descr file-id x y]
  (single-tile "helda.ForegroundTile" id descr file-id x y)
  )

(defn tileset [id descr file-id & rows]
  (insert-or-update {
    :description descr
    :attrs {
      :compId id
      :width (-> rows first count)
      :height (count rows)
      :tiles (map
        #(map (fn [t] {
          :x (first t)
          :y (second t)
          :fileId (or (get t 2) file-id)
          }) %)
        rows
        )
      }
    :tags [id]
    :actions {}
    }
    "helda.TileSet"
    )
  )

(defn scalable-tileset [id descr attrs]
  (insert-or-update {
    :description descr
    :attrs (assoc attrs :comp-id id)
    :tags [id]
    :actions {}
    }
    "helda.ScalableTileSet"
    )
  )
