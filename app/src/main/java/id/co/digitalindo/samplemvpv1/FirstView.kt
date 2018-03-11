package id.co.digitalindo.samplemvpv1

import id.co.digitalindo.samplemvpv1.model.ModelMVP

/**
 * Created by nandoseptianhusni on 3/11/18.
 */
interface FirstView {


    fun berhasil(hasil : ModelMVP)
    fun error()
}