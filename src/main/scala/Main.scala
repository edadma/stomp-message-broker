package xyz.hyperreal.stomp_message_broker

import xyz.hyperreal.stomp_server.StompServer

import scala.scalajs.js


object Main extends App {

    def authorize( headers: js.Dictionary[String] ) = {
      println( s"authorized: $headers" )
      true
    }

    val serverHostname = "192.168.0.117"
    val serverPort = 15674
    val serverPath = "/stomp"
    val server = new StompServer( "STOMP Message Broker/1.0", serverHostname, serverPort, serverPath, authorize, authorize, true )

}