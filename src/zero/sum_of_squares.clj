(ns zero.sum-of-squares)

(defn sum-of-squares [nums]
  (reduce + (map #(* % %) nums)))

(defn -main []
  (println (sum-of-squares [1 2 3 4 5]))
  (println (sum-of-squares [5 10 15])))
