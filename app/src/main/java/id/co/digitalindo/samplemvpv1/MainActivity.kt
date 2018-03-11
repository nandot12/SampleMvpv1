package id.co.digitalindo.samplemvpv1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import id.co.digitalindo.samplemvpv1.model.ModelMVP
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.alert
import org.jetbrains.anko.noButton
import org.jetbrains.anko.sdk25.coroutines.onClick
import org.jetbrains.anko.toast
import org.jetbrains.anko.yesButton

class MainActivity : AppCompatActivity(), FirstView {


    //TODO 5 deklrasi presenter
    lateinit var presenterImp: FirstPresenterImp

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //TODO 6 inisialisasi presenter
        presenterImp = FirstPresenterImp(this)
        buttonSubmit.onClick {
            presenterImp.tambahData(inputText.text.toString())
        }


    }
    override fun berhasil(hasil: ModelMVP) {

        //TODO 6 TAMPILAN DI ALERT
        alert {
            title = hasil.textmsgg

            noButton {

            }
            yesButton {d ->
                d.dismiss()

            }
        }
                .show()
    }


    override fun error() {
        //TODO 7
        toast("tidak boleh kosong")
    }
}
