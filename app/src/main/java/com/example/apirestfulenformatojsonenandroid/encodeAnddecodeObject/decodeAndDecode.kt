package com.example.apirestfulenformatojsonenandroid.encodeAnddecodeObject

import android.util.Log
import com.example.apirestfulenformatojsonenandroid.dataResponse.responseDataUsers
import com.example.apirestfulenformatojsonenandroid.dataResponse.responseUsers
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.ObjectInputStream
import java.io.ObjectOutputStream

class decodeAndDecode() {


    //las clases utilizadas para encode y decode deben estar marcadas por la notacion @Serializable
    // y se las serializa mediante el metodo Json.encodeToString() si no las serializamos por aquel metodo
    //muestra una excepcion de que no esta serializada

    public fun ObjectToByteArray(responseUsers: responseDataUsers):ByteArray
    {
        var bos = ByteArrayOutputStream()
        try {
            var oos=ObjectOutputStream(bos)
            var serializeObject= Json.encodeToString(responseUsers)
            oos.writeObject(serializeObject)
        }
        catch (ex:Exception){
            Log.i("ErrorCast","Error cast object in ByteArray")
        }
        return bos.toByteArray()
    }


    public fun decodeToObject(byteArray: ByteArray):responseDataUsers{
        var bais=ByteArrayInputStream(byteArray)
        var ois=ObjectInputStream(bais)
        var objSerialize=ois.readObject()
        return Json.decodeFromString(objSerialize.toString()) as responseDataUsers
    }


}