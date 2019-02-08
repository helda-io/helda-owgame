(ns helda-owgame.rules.fight)

(defn fight-action [from to]
  (let [
    attack-chk (-> from :attrs :attack-chk read-string)
    target-hp (-> to :attrs :hp)
    ]
    (println "Attack chk " attack-chk)
    (println "Target HP " target-hp)
    ;logic is very simple here
    (assoc-in to [:attrs :hp] (- target-hp attack-chk))
    )
  )
