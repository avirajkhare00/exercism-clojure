(ns two-fer)

(defn two-fer
  ([] (str "One for you, one for me."))
  ([s] (format "One for %s, one for me.", s))
)
