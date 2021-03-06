(defproject chain-api "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :aot :all
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/core.async "0.2.374"]
                 [com.stuartsierra/component "0.3.1"]
                 [com.taoensso/timbre "4.3.1"]
                 [clj-time "0.12.2"]
                 [slingshot "0.12.2"]
                 [http-kit "2.1.19"]
                 [ring "1.4.0"]
                 [ring/ring-defaults "0.2.0"]
                 [ring-cors "0.1.8"]
                 [compojure "1.5.0"]
                 [ring-basic-authentication "1.0.5"]
                 [buddy/buddy-hashers "1.2.0"]
                 [org.clojure/java.jdbc "0.7.0-alpha1"]
                 [org.postgresql/postgresql "9.4.1212"]
                 [nilenso/honeysql-postgres "0.2.2"]
                 [ring/ring-json "0.4.0"]
                 [cheshire "5.6.3"]])
