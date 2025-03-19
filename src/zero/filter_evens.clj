(ns zero.filter-evens)

(defn even-numbers [num]
  (if (zero? (mod num 2))
    (/ num 2)
    0))

(defn -main []
  (println (even-numbers 10))
  (println (even-numbers 11)))
