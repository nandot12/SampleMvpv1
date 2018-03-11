package id.co.digitalindo.samplemvpv1

import id.co.digitalindo.samplemvpv1.model.ModelMVP

/**
 * Created by nandoseptianhusni on 3/11/18.
 */
class FirstPresenterImp (model : FirstView) : FirstPresenter {



    var viewmodel : FirstView? = null

    init {


        viewmodel = model
    }

    override fun tambahData(msg: String) {


        //TODO 1 check inputan
        if(msg.isNotEmpty()){

            //TODO 2
            var model = ModelMVP(msg)


            //TODO 3 add ke view
            viewmodel?.berhasil(model)

        }else{
            //TODO 4 kalau seandainya kosong
            viewmodel?.error()
        }



    }


}