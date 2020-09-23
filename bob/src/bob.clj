(ns bob
  (:require [clojure.string :refer [upper-case blank?]]))

(defn response-for [s]
  (letfn [(question? [s] (= \? (last s)))
          (silence? [s] (blank? s))
          (shouting? [s] (and (= s (upper-case s))
                              (re-find #"\p{L}" s)))]

  (cond
    (shouting? s) "Whoa, chill out!"
    (question? s) "Sure."
    (silence?  s) "Fine. Be that way!"
    :else         "Whatever.")))
