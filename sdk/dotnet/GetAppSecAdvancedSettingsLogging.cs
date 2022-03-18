// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai
{
    public static class GetAppSecAdvancedSettingsLogging
    {
        /// <summary>
        /// **Scopes**: Security configuration; security policy
        /// 
        /// Returns information about your HTTP header logging controls. By default, information is returned for all the security policies in the configuration; however, you can return data for a single policy by using the `security_policy_id` parameter. The returned information is described in the [ConfigHeaderLog members](https://developer.akamai.com/api/cloud_security/application_security/v1.html#a6d1c316) section of the Application Security API.
        /// 
        /// **Related API Endpoint**: [/appsec/v1/configs/{configId}/versions/{versionNumber}/advanced-settings/logging](https://developer.akamai.com/api/cloud_security/application_security/v1.html#gethttpheaderloggingforaconfiguration)
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// Basic usage:
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Akamai = Pulumi.Akamai;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var configuration = Output.Create(Akamai.GetAppSecConfiguration.InvokeAsync(new Akamai.GetAppSecConfigurationArgs
        ///         {
        ///             Name = "Documentation",
        ///         }));
        ///         var customRules = configuration.Apply(configuration =&gt; Output.Create(Akamai.GetAppSecCustomRules.InvokeAsync(new Akamai.GetAppSecCustomRulesArgs
        ///         {
        ///             ConfigId = configuration.ConfigId,
        ///         })));
        ///         this.CustomRulesOutputText = customRules.Apply(customRules =&gt; customRules.OutputText);
        ///         this.CustomRulesJson = customRules.Apply(customRules =&gt; customRules.Json);
        ///         this.CustomRulesConfigId = customRules.Apply(customRules =&gt; customRules.ConfigId);
        ///         var specificCustomRule = configuration.Apply(configuration =&gt; Output.Create(Akamai.GetAppSecCustomRules.InvokeAsync(new Akamai.GetAppSecCustomRulesArgs
        ///         {
        ///             ConfigId = configuration.ConfigId,
        ///             CustomRuleId = 60029316,
        ///         })));
        ///         this.SpecificCustomRuleJson = specificCustomRule.Apply(specificCustomRule =&gt; specificCustomRule.Json);
        ///     }
        /// 
        ///     [Output("customRulesOutputText")]
        ///     public Output&lt;string&gt; CustomRulesOutputText { get; set; }
        ///     [Output("customRulesJson")]
        ///     public Output&lt;string&gt; CustomRulesJson { get; set; }
        ///     [Output("customRulesConfigId")]
        ///     public Output&lt;string&gt; CustomRulesConfigId { get; set; }
        ///     [Output("specificCustomRuleJson")]
        ///     public Output&lt;string&gt; SpecificCustomRuleJson { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// ## Output Options
        /// 
        /// The following options can be used to determine the information returned, and how that returned information is formatted:
        /// 
        /// - `json`. JSON-formatted list of information about the logging settings.
        /// - `output_text`. Tabular report showing the logging settings.
        /// </summary>
        public static Task<GetAppSecAdvancedSettingsLoggingResult> InvokeAsync(GetAppSecAdvancedSettingsLoggingArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetAppSecAdvancedSettingsLoggingResult>("akamai:index/getAppSecAdvancedSettingsLogging:getAppSecAdvancedSettingsLogging", args ?? new GetAppSecAdvancedSettingsLoggingArgs(), options.WithDefaults());

        /// <summary>
        /// **Scopes**: Security configuration; security policy
        /// 
        /// Returns information about your HTTP header logging controls. By default, information is returned for all the security policies in the configuration; however, you can return data for a single policy by using the `security_policy_id` parameter. The returned information is described in the [ConfigHeaderLog members](https://developer.akamai.com/api/cloud_security/application_security/v1.html#a6d1c316) section of the Application Security API.
        /// 
        /// **Related API Endpoint**: [/appsec/v1/configs/{configId}/versions/{versionNumber}/advanced-settings/logging](https://developer.akamai.com/api/cloud_security/application_security/v1.html#gethttpheaderloggingforaconfiguration)
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// Basic usage:
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using Akamai = Pulumi.Akamai;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var configuration = Output.Create(Akamai.GetAppSecConfiguration.InvokeAsync(new Akamai.GetAppSecConfigurationArgs
        ///         {
        ///             Name = "Documentation",
        ///         }));
        ///         var customRules = configuration.Apply(configuration =&gt; Output.Create(Akamai.GetAppSecCustomRules.InvokeAsync(new Akamai.GetAppSecCustomRulesArgs
        ///         {
        ///             ConfigId = configuration.ConfigId,
        ///         })));
        ///         this.CustomRulesOutputText = customRules.Apply(customRules =&gt; customRules.OutputText);
        ///         this.CustomRulesJson = customRules.Apply(customRules =&gt; customRules.Json);
        ///         this.CustomRulesConfigId = customRules.Apply(customRules =&gt; customRules.ConfigId);
        ///         var specificCustomRule = configuration.Apply(configuration =&gt; Output.Create(Akamai.GetAppSecCustomRules.InvokeAsync(new Akamai.GetAppSecCustomRulesArgs
        ///         {
        ///             ConfigId = configuration.ConfigId,
        ///             CustomRuleId = 60029316,
        ///         })));
        ///         this.SpecificCustomRuleJson = specificCustomRule.Apply(specificCustomRule =&gt; specificCustomRule.Json);
        ///     }
        /// 
        ///     [Output("customRulesOutputText")]
        ///     public Output&lt;string&gt; CustomRulesOutputText { get; set; }
        ///     [Output("customRulesJson")]
        ///     public Output&lt;string&gt; CustomRulesJson { get; set; }
        ///     [Output("customRulesConfigId")]
        ///     public Output&lt;string&gt; CustomRulesConfigId { get; set; }
        ///     [Output("specificCustomRuleJson")]
        ///     public Output&lt;string&gt; SpecificCustomRuleJson { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// ## Output Options
        /// 
        /// The following options can be used to determine the information returned, and how that returned information is formatted:
        /// 
        /// - `json`. JSON-formatted list of information about the logging settings.
        /// - `output_text`. Tabular report showing the logging settings.
        /// </summary>
        public static Output<GetAppSecAdvancedSettingsLoggingResult> Invoke(GetAppSecAdvancedSettingsLoggingInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetAppSecAdvancedSettingsLoggingResult>("akamai:index/getAppSecAdvancedSettingsLogging:getAppSecAdvancedSettingsLogging", args ?? new GetAppSecAdvancedSettingsLoggingInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetAppSecAdvancedSettingsLoggingArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// . Unique identifier of the security configuration associated with the logging settings.
        /// </summary>
        [Input("configId", required: true)]
        public int ConfigId { get; set; }

        /// <summary>
        /// . Unique identifier of the security policy associated with the logging settings. If not included, information is returned for all your security policies.
        /// </summary>
        [Input("securityPolicyId")]
        public string? SecurityPolicyId { get; set; }

        public GetAppSecAdvancedSettingsLoggingArgs()
        {
        }
    }

    public sealed class GetAppSecAdvancedSettingsLoggingInvokeArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// . Unique identifier of the security configuration associated with the logging settings.
        /// </summary>
        [Input("configId", required: true)]
        public Input<int> ConfigId { get; set; } = null!;

        /// <summary>
        /// . Unique identifier of the security policy associated with the logging settings. If not included, information is returned for all your security policies.
        /// </summary>
        [Input("securityPolicyId")]
        public Input<string>? SecurityPolicyId { get; set; }

        public GetAppSecAdvancedSettingsLoggingInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetAppSecAdvancedSettingsLoggingResult
    {
        public readonly int ConfigId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Json;
        public readonly string OutputText;
        public readonly string? SecurityPolicyId;

        [OutputConstructor]
        private GetAppSecAdvancedSettingsLoggingResult(
            int configId,

            string id,

            string json,

            string outputText,

            string? securityPolicyId)
        {
            ConfigId = configId;
            Id = id;
            Json = json;
            OutputText = outputText;
            SecurityPolicyId = securityPolicyId;
        }
    }
}