package com.auth0.samples.kotlinspringboot
import khttp.get
import khttp.responses.Response
import org.json.JSONObject
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Route() {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private val key = "40d37535-0394-4393-99fd-a2e6b3724024"
	private val vehicleTripUrl = "http://api.pugetsound.onebusaway.org/api/where/trip-for-vehicle/"
	private val stopInfoUrl = "http://api.pugetsound.onebusaway.org/api/where/stop/"

	// add in async route fetching.

	fun getStopData(stopId: String) {
		var fullStopUrl = "$stopInfoUrl$stopId.xml?"
		print("URL: $fullStopUrl")
		var response : Response = khttp.get(
				url = fullStopUrl
		)
		var obj : JSONObject = response.jsonObject
		print(obj)
	}

	fun getRouteData(routeId: String) {
		var fullRouteUrl = "$vehicleTripUrl$routeId.xml?"
		print("URL: $fullRouteUrl")
		var response : Response = khttp.get(
				url = fullRouteUrl,
				params = mapOf("key" to key, "includeReferences" to "true", "includeStatus" to "true")
		)
		var obj : JSONObject = response.jsonObject
		print(obj)
	}
}
