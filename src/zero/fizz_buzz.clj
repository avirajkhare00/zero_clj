(ns zero.fizz-buzz)

(defn fizz-buzz [num]
  (cond
    (and (= (mod num 3) 0) (= (mod num 5) 0)) "FizzBuzz"
    (= (mod num 3) 0) "Fizz"
    (= (mod num 5) 0) "Buzz"
    :else num))

(defn -main []
  (println (fizz-buzz 5))
  (println (fizz-buzz 6))
  (println (fizz-buzz 9))
  (println (fizz-buzz 10))
  (println (fizz-buzz 15)))
