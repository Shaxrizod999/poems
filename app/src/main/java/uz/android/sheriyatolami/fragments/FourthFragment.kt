package uz.android.sheriyatolami.fragments

import android.app.AlertDialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import uz.android.sheriyatolami.R
import uz.android.sheriyatolami.adapter.RecyclerAdapter
import uz.android.sheriyatolami.databinding.FragmentFourthBinding
import uz.android.sheriyatolami.databinding.FragmentThirdBinding
import uz.android.sheriyatolami.model.Sher

class FourthFragment : Fragment() {

    private lateinit var binding: FragmentFourthBinding
    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFourthBinding.inflate(inflater, container, false)

        binding.back3.setOnClickListener {
            findNavController().navigate(R.id.firstFragment)
        }
        binding.rv.adapter = RecyclerAdapter(initList()) {
            val dialog = AlertDialog.Builder(requireContext()).create()
            val dialogView = layoutInflater.inflate(R.layout.dialog_view, binding.root, false)
            var ss = dialogView.findViewById<TextView>(R.id.desc)
            ss.text = it.sher
            dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            dialog.setView(dialogView)
            dialog.show()
        }
        return binding.root
    }
    private fun initList(): ArrayList<Sher> {

        var list:ArrayList<Sher> = ArrayList()

        for (i in 1..4) {
            list.add(
                    Sher(
                            "Dardkashim", "Dunyoda dardkashim bir varoq qog‘oz \n" +
                            "Mening bor dardimni tinglay oladi\n" +
                            "\"Do‘stim ohlaringni\" deydi menga yoz\n" +
                            "Sen yengil tortgin- u  menda qoladi.\n"
                    )
            )
            list.add(Sher("Alamim", "Alamim qalbimda to‘lib yotganda\n" +
                    "Bir najot izlaydi nochor tuyg‘ular\n" +
                    "Yaqinim so‘zlari dilga botganda\n" +
                    "Hech kimsa sezmaydi, bilmaydi ular.\n"))
            list.add(Sher("Qo'rqaman", "Seni atirgulga o‘xshatish mumkin \n" +
                    "Yashnagan gullaring juda sevaman\n" +
                    "Tikoning zaxridan qo‘rqmayman lekin\n" +
                    "Seni so‘lishingdan yomon qo‘rqaman."))
            list.add(Sher("Dunyo haqida", "Bu dunyo haqida o‘ylayman doim\n" +
                    "Lekin bir xulosa kelmaydi aniq\n" +
                    "Sinovlar yo‘llaydi bizga ollohim\n" +
                    "Hayotning har kuni hammaga bog‘liq.\n."))
            list.add(Sher("Do'st", "Daraxtning har guli meva bo‘lolmas\n" +
                    "Yarim oy bir kunda to‘lin to‘lolmas\n" +
                    "Doim do‘stingman deb yurgan bir inson\n" +
                    "Sinovli kuningda yoningda qolmas.\n"))
            list.add(Sher("Ko'nglim", "Dunyo yolg‘onlarin haqiqat bilgan\n" +
                    "Bir g‘amga o‘kinib, quvonchda kulgan\n" +
                    "Yurakdan sevgani armoni bo‘lgan\n" +
                    "Shundayin soddadil ko‘nglim bor mening.\n"))
        }
        return list
    }
}

