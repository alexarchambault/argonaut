import argonaut._, Argonaut._

val json = """
  { "a" : 1, "b" : 2 }
"""

val result = Parse.parseOption(json)

result.foreach(println)
