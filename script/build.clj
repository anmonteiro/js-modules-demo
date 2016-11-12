(require '[cljs.build.api :as b])

(b/build "src"
  {:main 'js-modules-demo.core
   :asset-path "js/out"
   :optimizations :none
   :pseudo-names true
   :pretty-print true
   :output-to "resources/public/js/out/main.js"
   :output-dir "resources/public/js/out"
   :verbose true
   :externs ["resources/public/js/react.ext.js"
             "resources/public/js/react-dom.ext.js"
             "resources/public/js/svg.ext.js"]
   :language-in :ecmascript5
   ;; :foreign-libs [{:file "resources/public/js/react.js"
   ;;                 :file-min "resources/public/js/react.min.js"
   ;;                 :provides ["React"]
   ;;                 :module-type :commonjs}
   ;;                {:file "resources/public/js/react-dom.js"
   ;;                 :file-min "resources/public/js/react-dom.min.js"
   ;;                 :provides ["ReactDOM"]
   ;;                 :module-type :commonjs}]
   :closure-warnings {:non-standard-jsdoc :off}})
