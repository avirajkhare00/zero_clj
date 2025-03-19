(ns zero.find-max)

(defn find-max [nums]
  (println (apply max nums))
  )

(defn -main []
  (find-max [1 2 4 6]))
