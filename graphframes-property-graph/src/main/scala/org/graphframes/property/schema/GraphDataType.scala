package org.graphframes.property.schema

import org.apache.spark.sql.{types => sparkTypes}

object GraphDataType extends Enumeration {
  protected case class Val(s: String) extends super.Val {
    def sparkType: sparkTypes.DataType = {
      s match {
        case "BOOL" => sparkTypes.BooleanType
        case "INT32" => sparkTypes.IntegerType
        case "FLOAT" => sparkTypes.FloatType
        case "DOUBLE" => sparkTypes.DoubleType
        case "STRING" => sparkTypes.StringType
        case "LIST" => sparkTypes.ArrayType
        case "DATE" => sparkTypes.DateType
        case "TIMESTAMP" => sparkTypes.TimestampType
        case "TIME" => sparkTypes.IntegerType
      }
    }    
  }
  val BOOL = Val("BOOL")
  val INT32 = Val("INT32")
  val INT64 = Val("INT64")
  val FLOAT = Val("FLOAT")
  val DOUBLE = Val("DOUBLE")
  val STRING = Val("STRING")
  val LIST = Val("LIST")
  val DATE = Val("DATE")
  val TIMESTAMP = Val("TIMESTAMP")
  val TIME = Val("TIME")
}

