(ns armstrong-numbers)

(defn armstrong?
  [n]
  (let [exploded-digits (map #(Character/digit % 10) (str n))
        digit-count (count exploded-digits)]
    (== n (reduce + (map #(Math/pow % digit-count) exploded-digits)))))
