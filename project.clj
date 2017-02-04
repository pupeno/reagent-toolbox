;;;; Copyright © 2017 Flexpoint Tech Ltd

(defproject tech.dashman/reagent-toolbox "0.1.0-SNAPSHOT"
  :description "A wrapper for React Toolbox using cljsjs-react-toolbox and Reagent."
  :url "https://github.com/dashmantech/reagent-toolbox"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}

  :lein-release {:deploy-via :clojars}
  :scm {:name "git"
        :url  "https://github.com/dashmantech/reagent-toolbox"}

  :dependencies [[org.clojure/clojure "1.8.0" :scope "provided"]
                 [org.clojure/clojurescript "1.9.293" :scope "provided"]
                 [cljsjs/react-with-addons "15.2.1-0" :scope "provided"]
                 [reagent "0.6.0" :exclusions [cljsjs/react] :scope "provided"]
                 [cljsjs/react-toolbox "2.0.0-beta.6-0"]]

  :plugins [[lein-cljsbuild "1.1.4"]]

  :source-paths ["src/cljs"])
