package com.example.apirestfulenformatojsonenandroid.dataResponse

import android.os.Parcel
import android.os.Parcelable
import androidx.annotation.Nullable
import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable
import kotlinx.serialization.Serializer


@Serializable
data class responseUsers(@SerializedName("users") val usersList:List<responseDataUsers>?) {
}


@Serializable
data class responseDataUsers(@SerializedName("id") val id:String?,
                             @SerializedName("firstName") val firstName:String?,
                             @SerializedName("lastName") val lastName:String?,
                             @SerializedName("maidenName") val maidenName:String?,
                             @SerializedName("age") val age:String?,
                             @SerializedName("gender") val gender:String?,
                             @SerializedName("email") val email:String?,
                             @SerializedName("phone") val phone:String?,
                             @SerializedName("username") val username:String?,
                             @SerializedName("password") val password:String?,
                             @SerializedName("birthDate") val birthDate:String?,
                             @SerializedName("image") val image:String?,
                             @SerializedName("bloodGroup") val bloodGroup:String?,
                             @SerializedName("height") val height:String?,
                             @SerializedName("weight") val weight:String?,
                             @SerializedName("hair") val hair:responseHair?,
                             @SerializedName("domain") val domain:String?,
                             @SerializedName("ip") val ip:String?,
                             @SerializedName("address") val address:responseAddress?,
                             @SerializedName("macAddress") val macAddress:String?,
                             @SerializedName("university") val university:String?,
                             @SerializedName("bank") val bank:responseBank?,
                             @SerializedName("company") val company:responseCompany?,
                             @SerializedName("ein") val ein:String?,
                             @SerializedName("ssn") val ssn:String?,
                             @SerializedName("userAgent") val userAgent:String?,
                             @SerializedName("eyeColor") val eyeColor:String?
                            )

@Serializable
data class responseHair(@SerializedName("color") val color:String?,
                        @SerializedName("type") val type:String?)

@Serializable
data class responseAddress(@SerializedName("address") val address:String?,
                           @SerializedName("city") val city:String?,
                           @SerializedName("coordinates") val coordinates:responseCoordinates?,
                           @SerializedName("postalCode") val postalCode:Long?,
                           @SerializedName("state") val state:String?)

@Serializable
data class responseCoordinates(@SerializedName("lat") val lat:String?,
                               @SerializedName("lng") val lng:String?)

@Serializable
data class responseBank(@SerializedName("cardExpire") val cardExpire:String?,
                        @SerializedName("cardNumber") val cardNumber:String?,
                        @SerializedName("cardType") val cardType:String?,
                        @SerializedName("currency") val currency:String?,
                        @SerializedName("iban") val iban:String?)
@Serializable
data class responseCompany(@SerializedName("address") val address:responseAddress?,
                           @SerializedName("department") val department:String?,
                           @SerializedName("name") val name:String?,
                           @SerializedName("title") val title:String?)