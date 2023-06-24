package com.example.apirestfulenformatojsonenandroid.setInfoResult

import android.widget.ImageView
import com.example.apirestfulenformatojsonenandroid.dataResponse.responseDataUsers
import com.example.apirestfulenformatojsonenandroid.dataResponse.responseUsers
import com.example.apirestfulenformatojsonenandroid.databinding.ActivityResultsBinding
import com.squareup.picasso.Picasso

class setInfoResult(var User: responseDataUsers, var binding: ActivityResultsBinding) {

    init{
        setInfo()
    }

    private fun setInfo():Unit{
        setImg(User.image,binding.imgUser)
        binding.textId.setText(User.id)
        binding.textFirstName.setText(User.firstName)
        binding.textLastName.setText(User.lastName)
        binding.textMaidenName.setText(User.maidenName)
        binding.textAge.setText(User.age)
        binding.textGender.setText(User.gender)
        binding.textEmail.setText(User.email)
        binding.textPhone.setText(User.phone)
        binding.textUsername.setText(User.username)
        binding.textPassword.setText(User.password)
        binding.textBirthDate.setText(User.birthDate)
        binding.textBloodGroup.setText(User.bloodGroup)
        binding.textHeight.setText(User.height)
        binding.textWeight.setText(User.weight)
        binding.textEyeColor.setText(User.eyeColor)
        binding.textColor.setText(User.hair?.color)
        binding.textType.setText(User.hair?.type)
        binding.textDomain.setText(User.domain)
        binding.textIp.setText(User.ip)
        binding.textAddress.setText(User.address?.address)
        binding.textCity.setText(User.address?.city)
        binding.textLat.setText(User.address?.coordinates?.lat)
        binding.textLng.setText(User.address?.coordinates?.lng)
        binding.textPostalCode.setText(User.address?.postalCode.toString())
        binding.textState.setText(User.address?.state)
        binding.textMacAddress.setText(User.macAddress)
        binding.textUniversity.setText(User.university)
        binding.textCardExpire.setText(User.bank?.cardExpire)
        binding.textCardNumber.setText(User.bank?.cardNumber)
        binding.textCardType.setText(User.bank?.cardType)
        binding.textCurrency.setText(User.bank?.currency)
        binding.textIban.setText(User.bank?.iban)
        binding.textAddresstwo.setText(User.company?.address?.address)
        binding.textCitytwo.setText(User.company?.address?.city)
        binding.textLattwo.setText(User.company?.address?.coordinates?.lat)
        binding.textLngtwo.setText(User.company?.address?.coordinates?.lng)
        binding.textPostalCodetwo.setText(User.company?.address?.postalCode.toString())
        binding.textStatetwo.setText(User.company?.address?.state)
        binding.textDepartment.setText(User.company?.department)
        binding.textName.setText(User.company?.name)
        binding.textTitle.setText(User.company?.title)
        binding.textEin.setText(User.ein)
        binding.textSsn.setText(User.ssn)
        binding.textUserAgent.setText(User.userAgent)
    }

    private fun setImg(url:String?,img:ImageView):Unit{
        Picasso.get().load(url).into(img)
    }

}