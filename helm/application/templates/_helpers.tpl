{{ define "serviceAccountAnnotations" }}
    {{- $environment_id := .Values.awsAccountId | print }}
    {{- $environment_name := .Values.awsEnv | print }}
    {{- $annotations := .Values.serviceAccount.annotations | toYaml | replace "envid" $environment_id | replace "env" $environment_name}}
    {{- printf "%s" $annotations -}}
{{- end }}