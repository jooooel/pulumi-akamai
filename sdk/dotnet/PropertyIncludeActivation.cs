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
    /// Use the `akamai.PropertyIncludeActivation` resource to activate your include and make available to a property.
    /// 
    /// ## Basic usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Akamai = Pulumi.Akamai;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var myExample = new Akamai.PropertyIncludeActivation("myExample", new()
    ///     {
    ///         ContractId = "C-0N7RAC7",
    ///         GroupId = "X112233",
    ///         IncludeId = "inc_X12345",
    ///         Network = "STAGING",
    ///         NotifyEmails = new[]
    ///         {
    ///             "example@example.com",
    ///             "example2@example.com",
    ///         },
    ///         Version = 1,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Attributes reference
    /// 
    /// This resource returns this attribute:
    /// 
    /// * `validations` - The validation information in JSON format.
    /// </summary>
    [AkamaiResourceType("akamai:index/propertyIncludeActivation:PropertyIncludeActivation")]
    public partial class PropertyIncludeActivation : global::Pulumi.CustomResource
    {
        /// <summary>
        /// (Optional) Automatically acknowledge all rule warnings for activation and continue.
        /// </summary>
        [Output("autoAcknowledgeRuleWarnings")]
        public Output<bool?> AutoAcknowledgeRuleWarnings { get; private set; } = null!;

        /// <summary>
        /// Provides an audit record when activating on a production network
        /// </summary>
        [Output("complianceRecord")]
        public Output<Outputs.PropertyIncludeActivationComplianceRecord?> ComplianceRecord { get; private set; } = null!;

        /// <summary>
        /// (Required) A contract's unique ID, including the optional `ctr_` prefix.
        /// </summary>
        [Output("contractId")]
        public Output<string> ContractId { get; private set; } = null!;

        /// <summary>
        /// (Required) A group's unique ID, including the optional `grp_` prefix.
        /// </summary>
        [Output("groupId")]
        public Output<string> GroupId { get; private set; } = null!;

        /// <summary>
        /// (Required) An include's unique ID with the optional `inc_` prefix.
        /// </summary>
        [Output("includeId")]
        public Output<string> IncludeId { get; private set; } = null!;

        /// <summary>
        /// (Required) The network for which the activation will be performed.
        /// </summary>
        [Output("network")]
        public Output<string> Network { get; private set; } = null!;

        /// <summary>
        /// (Optional) A log message assigned to the activation request.
        /// </summary>
        [Output("note")]
        public Output<string?> Note { get; private set; } = null!;

        /// <summary>
        /// (Required) The list of email addresses to notify when the activation status changes.
        /// </summary>
        [Output("notifyEmails")]
        public Output<ImmutableArray<string>> NotifyEmails { get; private set; } = null!;

        /// <summary>
        /// The validation information in JSON format
        /// </summary>
        [Output("validations")]
        public Output<string> Validations { get; private set; } = null!;

        /// <summary>
        /// (Required) The version of the include you want to activate.
        /// </summary>
        [Output("version")]
        public Output<int> Version { get; private set; } = null!;


        /// <summary>
        /// Create a PropertyIncludeActivation resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public PropertyIncludeActivation(string name, PropertyIncludeActivationArgs args, CustomResourceOptions? options = null)
            : base("akamai:index/propertyIncludeActivation:PropertyIncludeActivation", name, args ?? new PropertyIncludeActivationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private PropertyIncludeActivation(string name, Input<string> id, PropertyIncludeActivationState? state = null, CustomResourceOptions? options = null)
            : base("akamai:index/propertyIncludeActivation:PropertyIncludeActivation", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing PropertyIncludeActivation resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static PropertyIncludeActivation Get(string name, Input<string> id, PropertyIncludeActivationState? state = null, CustomResourceOptions? options = null)
        {
            return new PropertyIncludeActivation(name, id, state, options);
        }
    }

    public sealed class PropertyIncludeActivationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// (Optional) Automatically acknowledge all rule warnings for activation and continue.
        /// </summary>
        [Input("autoAcknowledgeRuleWarnings")]
        public Input<bool>? AutoAcknowledgeRuleWarnings { get; set; }

        /// <summary>
        /// Provides an audit record when activating on a production network
        /// </summary>
        [Input("complianceRecord")]
        public Input<Inputs.PropertyIncludeActivationComplianceRecordArgs>? ComplianceRecord { get; set; }

        /// <summary>
        /// (Required) A contract's unique ID, including the optional `ctr_` prefix.
        /// </summary>
        [Input("contractId", required: true)]
        public Input<string> ContractId { get; set; } = null!;

        /// <summary>
        /// (Required) A group's unique ID, including the optional `grp_` prefix.
        /// </summary>
        [Input("groupId", required: true)]
        public Input<string> GroupId { get; set; } = null!;

        /// <summary>
        /// (Required) An include's unique ID with the optional `inc_` prefix.
        /// </summary>
        [Input("includeId", required: true)]
        public Input<string> IncludeId { get; set; } = null!;

        /// <summary>
        /// (Required) The network for which the activation will be performed.
        /// </summary>
        [Input("network", required: true)]
        public Input<string> Network { get; set; } = null!;

        /// <summary>
        /// (Optional) A log message assigned to the activation request.
        /// </summary>
        [Input("note")]
        public Input<string>? Note { get; set; }

        [Input("notifyEmails", required: true)]
        private InputList<string>? _notifyEmails;

        /// <summary>
        /// (Required) The list of email addresses to notify when the activation status changes.
        /// </summary>
        public InputList<string> NotifyEmails
        {
            get => _notifyEmails ?? (_notifyEmails = new InputList<string>());
            set => _notifyEmails = value;
        }

        /// <summary>
        /// (Required) The version of the include you want to activate.
        /// </summary>
        [Input("version", required: true)]
        public Input<int> Version { get; set; } = null!;

        public PropertyIncludeActivationArgs()
        {
        }
        public static new PropertyIncludeActivationArgs Empty => new PropertyIncludeActivationArgs();
    }

    public sealed class PropertyIncludeActivationState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// (Optional) Automatically acknowledge all rule warnings for activation and continue.
        /// </summary>
        [Input("autoAcknowledgeRuleWarnings")]
        public Input<bool>? AutoAcknowledgeRuleWarnings { get; set; }

        /// <summary>
        /// Provides an audit record when activating on a production network
        /// </summary>
        [Input("complianceRecord")]
        public Input<Inputs.PropertyIncludeActivationComplianceRecordGetArgs>? ComplianceRecord { get; set; }

        /// <summary>
        /// (Required) A contract's unique ID, including the optional `ctr_` prefix.
        /// </summary>
        [Input("contractId")]
        public Input<string>? ContractId { get; set; }

        /// <summary>
        /// (Required) A group's unique ID, including the optional `grp_` prefix.
        /// </summary>
        [Input("groupId")]
        public Input<string>? GroupId { get; set; }

        /// <summary>
        /// (Required) An include's unique ID with the optional `inc_` prefix.
        /// </summary>
        [Input("includeId")]
        public Input<string>? IncludeId { get; set; }

        /// <summary>
        /// (Required) The network for which the activation will be performed.
        /// </summary>
        [Input("network")]
        public Input<string>? Network { get; set; }

        /// <summary>
        /// (Optional) A log message assigned to the activation request.
        /// </summary>
        [Input("note")]
        public Input<string>? Note { get; set; }

        [Input("notifyEmails")]
        private InputList<string>? _notifyEmails;

        /// <summary>
        /// (Required) The list of email addresses to notify when the activation status changes.
        /// </summary>
        public InputList<string> NotifyEmails
        {
            get => _notifyEmails ?? (_notifyEmails = new InputList<string>());
            set => _notifyEmails = value;
        }

        /// <summary>
        /// The validation information in JSON format
        /// </summary>
        [Input("validations")]
        public Input<string>? Validations { get; set; }

        /// <summary>
        /// (Required) The version of the include you want to activate.
        /// </summary>
        [Input("version")]
        public Input<int>? Version { get; set; }

        public PropertyIncludeActivationState()
        {
        }
        public static new PropertyIncludeActivationState Empty => new PropertyIncludeActivationState();
    }
}