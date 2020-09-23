(ns rna-transcription)

(def dna->rna{\C \G,
              \G \C,
              \T \A,
              \A \U
})

(defn valid-dna? [strand] (every? (set (keys dna->rna)) strand))

(defn valid-rna? [strand] (every? (set (vals dna->rna)) strand))

(defn to-rna
  "For given DNA strand, transcribe to complementary RNA sequence"
  [dna]
  {:pre  [(valid-dna? dna)]
   :post [(valid-rna? %)]}
  (apply str (map dna->rna dna)))