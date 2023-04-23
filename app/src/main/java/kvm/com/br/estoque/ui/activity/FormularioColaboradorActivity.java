package kvm.com.br.estoque.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

import kvm.com.br.estoque.R;
import kvm.com.br.estoque.model.Colaborador;
import kvm.com.br.estoque.model.Endereco;
import kvm.com.br.estoque.ui.ConstantesActivity;
import kvm.com.br.estoque.ui.service.ColaboradorService;

public class FormularioColaboradorActivity extends AppCompatActivity implements ConstantesActivity {

    private ColaboradorService colaboradorService = new ColaboradorService();
    private EditText nomeEditText;
    private EditText emailEditText;
    private EditText cpfEditText;
    private EditText dataDeNascimentoEditText;
    private EditText senhaEditText;
    private EditText cepEditText;
    private EditText logradouroEditText;
    private EditText numeroEditText;
    private EditText bairroEditText;
    private EditText cidadeEditText;
    private EditText ufEditText;
    private EditText complementoEditText;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(FORMULARIO_COLABORADOR_TITULO_APPBAR);
        setContentView(R.layout.activity_formulario_colaborador);

        vinculaCamposDoFormulario();
    }

    private void vinculaCamposDoFormulario() {
        nomeEditText = findViewById(R.id.activity_formulario_colaborador_nome);
        emailEditText = findViewById(R.id.activity_formulario_colaborador_email);
        cpfEditText = findViewById(R.id.activity_formulario_colaborador_cpf);
        dataDeNascimentoEditText = findViewById(R.id.activity_formulario_colaborador_dataDeNascimento);
        senhaEditText = findViewById(R.id.activity_formulario_colaborador_senha);
        logradouroEditText = findViewById(R.id.activity_formulario_colaborador_rua);
        bairroEditText = findViewById(R.id.activity_formulario_colaborador_bairro);
        cepEditText = findViewById(R.id.activity_formulario_colaborador_cep);
        numeroEditText = findViewById(R.id.activity_formulario_colaborador_numero);
        cidadeEditText = findViewById(R.id.activity_formulario_colaborador_cidade);
        ufEditText = findViewById(R.id.activity_formulario_colaborador_uf);
        complementoEditText = findViewById(R.id.activity_formulario_colaborador_complemento);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_formulario_colaborador_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.activity_formulario_colaborador_menu_salvar){

            Colaborador colaborador = bindDeColaborador();
            colaboradorService.save(colaborador);
            abreColaboradorActivity();
        }
        return super.onOptionsItemSelected(item);
    }

    private void abreColaboradorActivity() {
        Intent vaiParaColaboradorActivity = new Intent(FormularioColaboradorActivity.this, ColaboradorActivity.class);
        startActivity(vaiParaColaboradorActivity);
    }

    private Colaborador bindDeColaborador() {
        String nome = nomeEditText.getText().toString();
        String email = emailEditText.getText().toString();
        Long cpf = Long.valueOf(cpfEditText.getText().toString());
        String dataDeNascimento = dataDeNascimentoEditText.getText().toString();
        String senha = senhaEditText.getText().toString();
        String logradouro = logradouroEditText.getText().toString();
        String bairro = bairroEditText.getText().toString();
        Long cep = Long.valueOf(cepEditText.getText().toString());
        int numero = Integer.valueOf(numeroEditText.getText().toString());
        String cidade = cidadeEditText.getText().toString();
        String uf = ufEditText.getText().toString();
        String complemento = complementoEditText.getText().toString();

        Colaborador colaborador = new Colaborador(nome,
                dataDeNascimento,
                email,
                cpf,
                senha,
                new Endereco(
                        cep,
                        logradouro,
                        numero,
                        bairro,
                        cidade,
                        uf,
                        complemento
                )
        );
        return colaborador;
    }
}