(require '[cljs.build.api :as b])

(b/build (b/inputs "src")
  {:main 'js-modules-demo.core
   :asset-path "js/out"
   :optimizations :advanced
   :output-to "resources/public/js/out/main.js"
   :output-dir "resources/public/js/out"
   :verbose true
   :language-in :ecmascript5
   :closure-warnings {:non-standard-jsdoc :off}})
