import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.cp2.R

class FragmentLista : Fragment() {

    private lateinit var listaRegistros: TextView
    private lateinit var buttonDelete: Button
    private lateinit var buttonUpdate: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_lista, container, false)

        listaRegistros = view.findViewById(R.id.listaRegistros)
        buttonDelete = view.findViewById(R.id.buttonDelete)
        buttonUpdate = view.findViewById(R.id.buttonUpdate)

        // Recupera os dados do bundle
        val nome = arguments?.getString("nome")
        val email = arguments?.getString("email")
        val telefone = arguments?.getString("telefone")
        val endereco = arguments?.getString("endereco")
        val idade = arguments?.getString("idade")

        // Exibe os dados na TextView
        listaRegistros.text = "Nome: $nome\nEmail: $email\nTelefone: $telefone\nEndereço: $endereco\nIdade: $idade"

        // Botão de deletar (simples exemplo, sem persistência)
        buttonDelete.setOnClickListener {
            listaRegistros.text = "Registro deletado"
        }

        // Botão de atualizar (apenas exemplo)
        buttonUpdate.setOnClickListener {
            Toast.makeText(context, "Funcionalidade de atualização em breve", Toast.LENGTH_SHORT).show()
        }

        return view
    }
}
