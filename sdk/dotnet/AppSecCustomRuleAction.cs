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
    /// The `akamai.AppSecCustomRuleAction` resource allows you to associate an action to a custom rule.
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
    ///             Name = "Akamai Tools",
    ///         }));
    ///         var createCustomRuleAction = new Akamai.AppSecCustomRuleAction("createCustomRuleAction", new Akamai.AppSecCustomRuleActionArgs
    ///         {
    ///             ConfigId = configuration.Apply(configuration =&gt; configuration.ConfigId),
    ///             Version = configuration.Apply(configuration =&gt; configuration.LatestVersion),
    ///             PolicyId = "crAP_75829",
    ///             CustomRuleId = 12345,
    ///             CustomRuleAction = "alert",
    ///         });
    ///         this.CustomRuleId = createCustomRuleAction.CustomRuleId;
    ///     }
    /// 
    ///     [Output("customRuleId")]
    ///     public Output&lt;string&gt; CustomRuleId { get; set; }
    /// }
    /// ```
    /// </summary>
    public partial class AppSecCustomRuleAction : Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of the security configuration to use.
        /// </summary>
        [Output("configId")]
        public Output<int> ConfigId { get; private set; } = null!;

        /// <summary>
        /// The action to be taken when the custom rule is invoked. Must be one of the following:
        /// * alert
        /// * deny
        /// * none
        /// </summary>
        [Output("customRuleAction")]
        public Output<string> CustomRuleAction { get; private set; } = null!;

        /// <summary>
        /// The ID of the custom rule.
        /// </summary>
        [Output("customRuleId")]
        public Output<int> CustomRuleId { get; private set; } = null!;

        /// <summary>
        /// The
        /// </summary>
        [Output("policyId")]
        public Output<string> PolicyId { get; private set; } = null!;

        /// <summary>
        /// The version number of the security configuration to use.
        /// </summary>
        [Output("version")]
        public Output<int> Version { get; private set; } = null!;


        /// <summary>
        /// Create a AppSecCustomRuleAction resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AppSecCustomRuleAction(string name, AppSecCustomRuleActionArgs args, CustomResourceOptions? options = null)
            : base("akamai:index/appSecCustomRuleAction:AppSecCustomRuleAction", name, args ?? new AppSecCustomRuleActionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AppSecCustomRuleAction(string name, Input<string> id, AppSecCustomRuleActionState? state = null, CustomResourceOptions? options = null)
            : base("akamai:index/appSecCustomRuleAction:AppSecCustomRuleAction", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing AppSecCustomRuleAction resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AppSecCustomRuleAction Get(string name, Input<string> id, AppSecCustomRuleActionState? state = null, CustomResourceOptions? options = null)
        {
            return new AppSecCustomRuleAction(name, id, state, options);
        }
    }

    public sealed class AppSecCustomRuleActionArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the security configuration to use.
        /// </summary>
        [Input("configId", required: true)]
        public Input<int> ConfigId { get; set; } = null!;

        /// <summary>
        /// The action to be taken when the custom rule is invoked. Must be one of the following:
        /// * alert
        /// * deny
        /// * none
        /// </summary>
        [Input("customRuleAction", required: true)]
        public Input<string> CustomRuleAction { get; set; } = null!;

        /// <summary>
        /// The ID of the custom rule.
        /// </summary>
        [Input("customRuleId", required: true)]
        public Input<int> CustomRuleId { get; set; } = null!;

        /// <summary>
        /// The
        /// </summary>
        [Input("policyId", required: true)]
        public Input<string> PolicyId { get; set; } = null!;

        /// <summary>
        /// The version number of the security configuration to use.
        /// </summary>
        [Input("version", required: true)]
        public Input<int> Version { get; set; } = null!;

        public AppSecCustomRuleActionArgs()
        {
        }
    }

    public sealed class AppSecCustomRuleActionState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the security configuration to use.
        /// </summary>
        [Input("configId")]
        public Input<int>? ConfigId { get; set; }

        /// <summary>
        /// The action to be taken when the custom rule is invoked. Must be one of the following:
        /// * alert
        /// * deny
        /// * none
        /// </summary>
        [Input("customRuleAction")]
        public Input<string>? CustomRuleAction { get; set; }

        /// <summary>
        /// The ID of the custom rule.
        /// </summary>
        [Input("customRuleId")]
        public Input<int>? CustomRuleId { get; set; }

        /// <summary>
        /// The
        /// </summary>
        [Input("policyId")]
        public Input<string>? PolicyId { get; set; }

        /// <summary>
        /// The version number of the security configuration to use.
        /// </summary>
        [Input("version")]
        public Input<int>? Version { get; set; }

        public AppSecCustomRuleActionState()
        {
        }
    }
}