### Generate OOAPI files:
- `brew install openapi-generator`
- Donwload github files as zip: https://github.com/open-education-api/specification
- Unzip the files
- Run: 
```bash
openapi-generator generate -i specification-master/v5/spec.yaml -g java -o openapi --skip-validate-spec --global-property models --additional-properties=library=webclient`
````
- info on webclients: https://openapi-generator.tech/docs/generators/java/
- config: https://openapi-generator.tech/docs/configuration/

