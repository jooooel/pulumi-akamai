// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai
{
    [AkamaiResourceType("akamai:index/botmanCustomDenyAction:BotmanCustomDenyAction")]
    public partial class BotmanCustomDenyAction : global::Pulumi.CustomResource
    {
        [Output("actionId")]
        public Output<string> ActionId { get; private set; } = null!;

        [Output("configId")]
        public Output<int> ConfigId { get; private set; } = null!;

        [Output("customDenyAction")]
        public Output<string> CustomDenyAction { get; private set; } = null!;


        /// <summary>
        /// Create a BotmanCustomDenyAction resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public BotmanCustomDenyAction(string name, BotmanCustomDenyActionArgs args, CustomResourceOptions? options = null)
            : base("akamai:index/botmanCustomDenyAction:BotmanCustomDenyAction", name, args ?? new BotmanCustomDenyActionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private BotmanCustomDenyAction(string name, Input<string> id, BotmanCustomDenyActionState? state = null, CustomResourceOptions? options = null)
            : base("akamai:index/botmanCustomDenyAction:BotmanCustomDenyAction", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing BotmanCustomDenyAction resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static BotmanCustomDenyAction Get(string name, Input<string> id, BotmanCustomDenyActionState? state = null, CustomResourceOptions? options = null)
        {
            return new BotmanCustomDenyAction(name, id, state, options);
        }
    }

    public sealed class BotmanCustomDenyActionArgs : global::Pulumi.ResourceArgs
    {
        [Input("configId", required: true)]
        public Input<int> ConfigId { get; set; } = null!;

        [Input("customDenyAction", required: true)]
        public Input<string> CustomDenyAction { get; set; } = null!;

        public BotmanCustomDenyActionArgs()
        {
        }
        public static new BotmanCustomDenyActionArgs Empty => new BotmanCustomDenyActionArgs();
    }

    public sealed class BotmanCustomDenyActionState : global::Pulumi.ResourceArgs
    {
        [Input("actionId")]
        public Input<string>? ActionId { get; set; }

        [Input("configId")]
        public Input<int>? ConfigId { get; set; }

        [Input("customDenyAction")]
        public Input<string>? CustomDenyAction { get; set; }

        public BotmanCustomDenyActionState()
        {
        }
        public static new BotmanCustomDenyActionState Empty => new BotmanCustomDenyActionState();
    }
}