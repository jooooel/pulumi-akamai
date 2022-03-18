// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai
{
    /// <summary>
    /// **Scopes**: Security policy
    /// 
    /// Modifies the penalty box settings for a security policy. When using automated attack groups, and when the penalty box is enabled, clients that trigger an attack group  are placed in the “penalty box.” That means that, for the next 10 minutes, all requests from that client are ignored.
    /// 
    /// **Related API Endpoint**: [/appsec/v1/configs/{configId}/versions/{versionNumber}/match-targets/sequence](https://developer.akamai.com/api/cloud_security/application_security/v1.html#putpenaltybox)
    /// 
    /// ## Example Usage
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
    ///         var penaltyBox = new Akamai.AppSecPenaltyBox("penaltyBox", new Akamai.AppSecPenaltyBoxArgs
    ///         {
    ///             ConfigId = configuration.Apply(configuration =&gt; configuration.ConfigId),
    ///             SecurityPolicyId = "gms1_134637",
    ///             PenaltyBoxProtection = true,
    ///             PenaltyBoxAction = "deny",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// </summary>
    [AkamaiResourceType("akamai:index/appSecPenaltyBox:AppSecPenaltyBox")]
    public partial class AppSecPenaltyBox : Pulumi.CustomResource
    {
        /// <summary>
        /// . Unique identifier of the security configuration associated with the penalty box settings being modified.
        /// </summary>
        [Output("configId")]
        public Output<int> ConfigId { get; private set; } = null!;

        /// <summary>
        /// . Action taken any time penalty box protection is triggered. Allowed values are:
        /// - **alert**. Record the event,
        /// - **deny**. Block the request.
        /// - **deny_custom_{custom_deny_id}**. Take the action specified by the custom deny.
        /// - **none**. Take no action.
        /// </summary>
        [Output("penaltyBoxAction")]
        public Output<string> PenaltyBoxAction { get; private set; } = null!;

        /// <summary>
        /// . Set to **true** to enable penalty box protection; set to **false** to disable penalty box protection.
        /// </summary>
        [Output("penaltyBoxProtection")]
        public Output<bool> PenaltyBoxProtection { get; private set; } = null!;

        /// <summary>
        /// . Unique identifier of the security policy associated with the penalty box settings being modified.
        /// </summary>
        [Output("securityPolicyId")]
        public Output<string> SecurityPolicyId { get; private set; } = null!;


        /// <summary>
        /// Create a AppSecPenaltyBox resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AppSecPenaltyBox(string name, AppSecPenaltyBoxArgs args, CustomResourceOptions? options = null)
            : base("akamai:index/appSecPenaltyBox:AppSecPenaltyBox", name, args ?? new AppSecPenaltyBoxArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AppSecPenaltyBox(string name, Input<string> id, AppSecPenaltyBoxState? state = null, CustomResourceOptions? options = null)
            : base("akamai:index/appSecPenaltyBox:AppSecPenaltyBox", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing AppSecPenaltyBox resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AppSecPenaltyBox Get(string name, Input<string> id, AppSecPenaltyBoxState? state = null, CustomResourceOptions? options = null)
        {
            return new AppSecPenaltyBox(name, id, state, options);
        }
    }

    public sealed class AppSecPenaltyBoxArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// . Unique identifier of the security configuration associated with the penalty box settings being modified.
        /// </summary>
        [Input("configId", required: true)]
        public Input<int> ConfigId { get; set; } = null!;

        /// <summary>
        /// . Action taken any time penalty box protection is triggered. Allowed values are:
        /// - **alert**. Record the event,
        /// - **deny**. Block the request.
        /// - **deny_custom_{custom_deny_id}**. Take the action specified by the custom deny.
        /// - **none**. Take no action.
        /// </summary>
        [Input("penaltyBoxAction", required: true)]
        public Input<string> PenaltyBoxAction { get; set; } = null!;

        /// <summary>
        /// . Set to **true** to enable penalty box protection; set to **false** to disable penalty box protection.
        /// </summary>
        [Input("penaltyBoxProtection", required: true)]
        public Input<bool> PenaltyBoxProtection { get; set; } = null!;

        /// <summary>
        /// . Unique identifier of the security policy associated with the penalty box settings being modified.
        /// </summary>
        [Input("securityPolicyId", required: true)]
        public Input<string> SecurityPolicyId { get; set; } = null!;

        public AppSecPenaltyBoxArgs()
        {
        }
    }

    public sealed class AppSecPenaltyBoxState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// . Unique identifier of the security configuration associated with the penalty box settings being modified.
        /// </summary>
        [Input("configId")]
        public Input<int>? ConfigId { get; set; }

        /// <summary>
        /// . Action taken any time penalty box protection is triggered. Allowed values are:
        /// - **alert**. Record the event,
        /// - **deny**. Block the request.
        /// - **deny_custom_{custom_deny_id}**. Take the action specified by the custom deny.
        /// - **none**. Take no action.
        /// </summary>
        [Input("penaltyBoxAction")]
        public Input<string>? PenaltyBoxAction { get; set; }

        /// <summary>
        /// . Set to **true** to enable penalty box protection; set to **false** to disable penalty box protection.
        /// </summary>
        [Input("penaltyBoxProtection")]
        public Input<bool>? PenaltyBoxProtection { get; set; }

        /// <summary>
        /// . Unique identifier of the security policy associated with the penalty box settings being modified.
        /// </summary>
        [Input("securityPolicyId")]
        public Input<string>? SecurityPolicyId { get; set; }

        public AppSecPenaltyBoxState()
        {
        }
    }
}