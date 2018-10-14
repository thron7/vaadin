(defproject {{name}} "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://example.com/FIXME"

  :dependencies [[org.clojure/clojure "1.8.0"]
                 [com.vaadin/vaadin-server "7.3.1" :exclusions [
                      [com.vaadin.external.flute/flute]
                      [com.vaadin.external.google/guava]]]
                 [com.vaadin/vaadin-client-compiled "7.3.1"]
                 [com.vaadin/vaadin-client "7.3.1" :scope "provided"]
                 [com.vaadin/vaadin-themes "7.3.1"]
                 [javax.servlet/javax.servlet-api "4.0.1" :scope "provided"]]
  :aot [{{name}}.{{name}}ui]
  :plugins [[lein-servlet "0.4.1"]]
  
  :servlet {:deps [[lein-servlet/adapter-jetty7 "0.4.1"]]
            :config {:engine :jetty
                     :host "localhost"
                     :port 3000}
            :webapps {"/"
                       {:web-xml "src/main/webapp/WEB-INF/web.xml"
                        :public "resources"}}})
