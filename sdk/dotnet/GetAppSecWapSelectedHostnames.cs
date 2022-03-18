// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai
{
    public static class GetAppSecWapSelectedHostnames
    {
        /// <summary>
        /// **Scopes**: Security policy
        /// 
        /// Returns hostnames currently protected or being evaluated by a configuration and security policy.
        /// This resource is available only to organizations running Web Application Protector (WAP).
        /// Note that the WAP selected hostnames feature is currently in beta.
        /// Please contact your Akamai representative for more information.
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
        ///         var wapSelectedHostnames = configuration.Apply(configuration =&gt; Output.Create(Akamai.GetAppSecWapSelectedHostnames.InvokeAsync(new Akamai.GetAppSecWapSelectedHostnamesArgs
        ///         {
        ///             ConfigId = configuration.ConfigId,
        ///             SecurityPolicyId = "gms1_134637",
        ///         })));
        ///         this.ProtectedHostnames = wapSelectedHostnames.Apply(wapSelectedHostnames =&gt; wapSelectedHostnames.ProtectedHosts);
        ///         this.EvaluatedHostnames = wapSelectedHostnames.Apply(wapSelectedHostnames =&gt; wapSelectedHostnames.EvaluatedHosts);
        ///     }
        /// 
        ///     [Output("protectedHostnames")]
        ///     public Output&lt;string&gt; ProtectedHostnames { get; set; }
        ///     [Output("evaluatedHostnames")]
        ///     public Output&lt;string&gt; EvaluatedHostnames { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// ## Output Options
        /// 
        /// The following options can be used to determine the information returned and how that returned information is formatted:
        /// 
        /// - `protected_hostnames`. List of hostnames currently protected under the security configuration and security policy.
        /// - `evaluated_hostnames`. List of hostnames currently being evaluated under the security configuration and security policy.
        /// - `hostnames_json`. JSON-formatted report of the protected and evaluated hostnames.
        /// - `output_text`. Tabular reports of the protected and evaluated hostnames.
        /// </summary>
        public static Task<GetAppSecWapSelectedHostnamesResult> InvokeAsync(GetAppSecWapSelectedHostnamesArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetAppSecWapSelectedHostnamesResult>("akamai:index/getAppSecWapSelectedHostnames:getAppSecWapSelectedHostnames", args ?? new GetAppSecWapSelectedHostnamesArgs(), options.WithDefaults());

        /// <summary>
        /// **Scopes**: Security policy
        /// 
        /// Returns hostnames currently protected or being evaluated by a configuration and security policy.
        /// This resource is available only to organizations running Web Application Protector (WAP).
        /// Note that the WAP selected hostnames feature is currently in beta.
        /// Please contact your Akamai representative for more information.
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
        ///         var wapSelectedHostnames = configuration.Apply(configuration =&gt; Output.Create(Akamai.GetAppSecWapSelectedHostnames.InvokeAsync(new Akamai.GetAppSecWapSelectedHostnamesArgs
        ///         {
        ///             ConfigId = configuration.ConfigId,
        ///             SecurityPolicyId = "gms1_134637",
        ///         })));
        ///         this.ProtectedHostnames = wapSelectedHostnames.Apply(wapSelectedHostnames =&gt; wapSelectedHostnames.ProtectedHosts);
        ///         this.EvaluatedHostnames = wapSelectedHostnames.Apply(wapSelectedHostnames =&gt; wapSelectedHostnames.EvaluatedHosts);
        ///     }
        /// 
        ///     [Output("protectedHostnames")]
        ///     public Output&lt;string&gt; ProtectedHostnames { get; set; }
        ///     [Output("evaluatedHostnames")]
        ///     public Output&lt;string&gt; EvaluatedHostnames { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// ## Output Options
        /// 
        /// The following options can be used to determine the information returned and how that returned information is formatted:
        /// 
        /// - `protected_hostnames`. List of hostnames currently protected under the security configuration and security policy.
        /// - `evaluated_hostnames`. List of hostnames currently being evaluated under the security configuration and security policy.
        /// - `hostnames_json`. JSON-formatted report of the protected and evaluated hostnames.
        /// - `output_text`. Tabular reports of the protected and evaluated hostnames.
        /// </summary>
        public static Output<GetAppSecWapSelectedHostnamesResult> Invoke(GetAppSecWapSelectedHostnamesInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetAppSecWapSelectedHostnamesResult>("akamai:index/getAppSecWapSelectedHostnames:getAppSecWapSelectedHostnames", args ?? new GetAppSecWapSelectedHostnamesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetAppSecWapSelectedHostnamesArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// . Unique identifier of the security configuration associated with the hostnames.
        /// </summary>
        [Input("configId", required: true)]
        public int ConfigId { get; set; }

        /// <summary>
        /// . Unique identifier of the security policy associated with the hostnames.
        /// </summary>
        [Input("securityPolicyId", required: true)]
        public string SecurityPolicyId { get; set; } = null!;

        public GetAppSecWapSelectedHostnamesArgs()
        {
        }
    }

    public sealed class GetAppSecWapSelectedHostnamesInvokeArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// . Unique identifier of the security configuration associated with the hostnames.
        /// </summary>
        [Input("configId", required: true)]
        public Input<int> ConfigId { get; set; } = null!;

        /// <summary>
        /// . Unique identifier of the security policy associated with the hostnames.
        /// </summary>
        [Input("securityPolicyId", required: true)]
        public Input<string> SecurityPolicyId { get; set; } = null!;

        public GetAppSecWapSelectedHostnamesInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetAppSecWapSelectedHostnamesResult
    {
        public readonly int ConfigId;
        public readonly ImmutableArray<string> EvaluatedHosts;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Json;
        public readonly string MatchTargets;
        public readonly string OutputText;
        public readonly ImmutableArray<string> ProtectedHosts;
        public readonly string SecurityPolicyId;
        public readonly ImmutableArray<string> SelectedHosts;

        [OutputConstructor]
        private GetAppSecWapSelectedHostnamesResult(
            int configId,

            ImmutableArray<string> evaluatedHosts,

            string id,

            string json,

            string matchTargets,

            string outputText,

            ImmutableArray<string> protectedHosts,

            string securityPolicyId,

            ImmutableArray<string> selectedHosts)
        {
            ConfigId = configId;
            EvaluatedHosts = evaluatedHosts;
            Id = id;
            Json = json;
            MatchTargets = matchTargets;
            OutputText = outputText;
            ProtectedHosts = protectedHosts;
            SecurityPolicyId = securityPolicyId;
            SelectedHosts = selectedHosts;
        }
    }
}