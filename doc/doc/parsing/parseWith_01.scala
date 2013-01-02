import argonaut._, Argonaut._

val json = """
  {
    "name" : "bob",
    "age" : 49
  }
"""

val result = Parse.parseWith(json, _.isObject, _ => false)

println(if (result) "json is an object" else "json is not an object")
