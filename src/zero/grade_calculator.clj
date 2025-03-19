(ns zero.grade-calculator)

(defn get-grade [num]
  (cond
    (> num 90) "A"
    (> num 80) "B"
    (> num 70) "C"
    (> num 60) "D"
    :else "E"))

(defn -main []
  (println (get-grade 95))
  (println (get-grade 75))
  (println (get-grade 42)))
