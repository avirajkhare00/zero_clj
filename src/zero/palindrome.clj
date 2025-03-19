(ns zero.palindrome)
(require '[clojure.string :as str])

(defn palindrome [s]
  (= s (str/reverse s)))

(defn -main []
  (println (palindrome "aviraj"))
  (println (palindrome "naman")))
