// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai
{
    [AkamaiResourceType("akamai:index/botmanCustomBotCategoryAction:BotmanCustomBotCategoryAction")]
    public partial class BotmanCustomBotCategoryAction : global::Pulumi.CustomResource
    {
        [Output("categoryId")]
        public Output<string> CategoryId { get; private set; } = null!;

        [Output("configId")]
        public Output<int> ConfigId { get; private set; } = null!;

        [Output("customBotCategoryAction")]
        public Output<string> CustomBotCategoryAction { get; private set; } = null!;

        [Output("securityPolicyId")]
        public Output<string> SecurityPolicyId { get; private set; } = null!;


        /// <summary>
        /// Create a BotmanCustomBotCategoryAction resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public BotmanCustomBotCategoryAction(string name, BotmanCustomBotCategoryActionArgs args, CustomResourceOptions? options = null)
            : base("akamai:index/botmanCustomBotCategoryAction:BotmanCustomBotCategoryAction", name, args ?? new BotmanCustomBotCategoryActionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private BotmanCustomBotCategoryAction(string name, Input<string> id, BotmanCustomBotCategoryActionState? state = null, CustomResourceOptions? options = null)
            : base("akamai:index/botmanCustomBotCategoryAction:BotmanCustomBotCategoryAction", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing BotmanCustomBotCategoryAction resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static BotmanCustomBotCategoryAction Get(string name, Input<string> id, BotmanCustomBotCategoryActionState? state = null, CustomResourceOptions? options = null)
        {
            return new BotmanCustomBotCategoryAction(name, id, state, options);
        }
    }

    public sealed class BotmanCustomBotCategoryActionArgs : global::Pulumi.ResourceArgs
    {
        [Input("categoryId", required: true)]
        public Input<string> CategoryId { get; set; } = null!;

        [Input("configId", required: true)]
        public Input<int> ConfigId { get; set; } = null!;

        [Input("customBotCategoryAction", required: true)]
        public Input<string> CustomBotCategoryAction { get; set; } = null!;

        [Input("securityPolicyId", required: true)]
        public Input<string> SecurityPolicyId { get; set; } = null!;

        public BotmanCustomBotCategoryActionArgs()
        {
        }
        public static new BotmanCustomBotCategoryActionArgs Empty => new BotmanCustomBotCategoryActionArgs();
    }

    public sealed class BotmanCustomBotCategoryActionState : global::Pulumi.ResourceArgs
    {
        [Input("categoryId")]
        public Input<string>? CategoryId { get; set; }

        [Input("configId")]
        public Input<int>? ConfigId { get; set; }

        [Input("customBotCategoryAction")]
        public Input<string>? CustomBotCategoryAction { get; set; }

        [Input("securityPolicyId")]
        public Input<string>? SecurityPolicyId { get; set; }

        public BotmanCustomBotCategoryActionState()
        {
        }
        public static new BotmanCustomBotCategoryActionState Empty => new BotmanCustomBotCategoryActionState();
    }
}