// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai
{
    [AkamaiResourceType("akamai:index/clientlistList:ClientlistList")]
    public partial class ClientlistList : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Contract ID for which client list is assigned.
        /// </summary>
        [Output("contractId")]
        public Output<string> ContractId { get; private set; } = null!;

        /// <summary>
        /// Group ID for which client list is assigned.
        /// </summary>
        [Output("groupId")]
        public Output<int> GroupId { get; private set; } = null!;

        /// <summary>
        /// Set of items containing item information.
        /// </summary>
        [Output("items")]
        public Output<ImmutableArray<Outputs.ClientlistListItem>> Items { get; private set; } = null!;

        /// <summary>
        /// The number of items that a client list contains.
        /// </summary>
        [Output("itemsCount")]
        public Output<int> ItemsCount { get; private set; } = null!;

        /// <summary>
        /// The ID of the client list.
        /// </summary>
        [Output("listId")]
        public Output<string> ListId { get; private set; } = null!;

        /// <summary>
        /// The name of the client list.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The client list notes.
        /// </summary>
        [Output("notes")]
        public Output<string?> Notes { get; private set; } = null!;

        /// <summary>
        /// The client list tags.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableArray<string>> Tags { get; private set; } = null!;

        /// <summary>
        /// The type of the client list. Valid types: [IP GEO ASN TLS_FINGERPRINT FILE_HASH]
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;

        /// <summary>
        /// The current version of the client list.
        /// </summary>
        [Output("version")]
        public Output<int> Version { get; private set; } = null!;


        /// <summary>
        /// Create a ClientlistList resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ClientlistList(string name, ClientlistListArgs args, CustomResourceOptions? options = null)
            : base("akamai:index/clientlistList:ClientlistList", name, args ?? new ClientlistListArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ClientlistList(string name, Input<string> id, ClientlistListState? state = null, CustomResourceOptions? options = null)
            : base("akamai:index/clientlistList:ClientlistList", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ClientlistList resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ClientlistList Get(string name, Input<string> id, ClientlistListState? state = null, CustomResourceOptions? options = null)
        {
            return new ClientlistList(name, id, state, options);
        }
    }

    public sealed class ClientlistListArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Contract ID for which client list is assigned.
        /// </summary>
        [Input("contractId", required: true)]
        public Input<string> ContractId { get; set; } = null!;

        /// <summary>
        /// Group ID for which client list is assigned.
        /// </summary>
        [Input("groupId", required: true)]
        public Input<int> GroupId { get; set; } = null!;

        [Input("items")]
        private InputList<Inputs.ClientlistListItemArgs>? _items;

        /// <summary>
        /// Set of items containing item information.
        /// </summary>
        public InputList<Inputs.ClientlistListItemArgs> Items
        {
            get => _items ?? (_items = new InputList<Inputs.ClientlistListItemArgs>());
            set => _items = value;
        }

        /// <summary>
        /// The name of the client list.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The client list notes.
        /// </summary>
        [Input("notes")]
        public Input<string>? Notes { get; set; }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// The client list tags.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        /// <summary>
        /// The type of the client list. Valid types: [IP GEO ASN TLS_FINGERPRINT FILE_HASH]
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public ClientlistListArgs()
        {
        }
        public static new ClientlistListArgs Empty => new ClientlistListArgs();
    }

    public sealed class ClientlistListState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Contract ID for which client list is assigned.
        /// </summary>
        [Input("contractId")]
        public Input<string>? ContractId { get; set; }

        /// <summary>
        /// Group ID for which client list is assigned.
        /// </summary>
        [Input("groupId")]
        public Input<int>? GroupId { get; set; }

        [Input("items")]
        private InputList<Inputs.ClientlistListItemGetArgs>? _items;

        /// <summary>
        /// Set of items containing item information.
        /// </summary>
        public InputList<Inputs.ClientlistListItemGetArgs> Items
        {
            get => _items ?? (_items = new InputList<Inputs.ClientlistListItemGetArgs>());
            set => _items = value;
        }

        /// <summary>
        /// The number of items that a client list contains.
        /// </summary>
        [Input("itemsCount")]
        public Input<int>? ItemsCount { get; set; }

        /// <summary>
        /// The ID of the client list.
        /// </summary>
        [Input("listId")]
        public Input<string>? ListId { get; set; }

        /// <summary>
        /// The name of the client list.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The client list notes.
        /// </summary>
        [Input("notes")]
        public Input<string>? Notes { get; set; }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// The client list tags.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        /// <summary>
        /// The type of the client list. Valid types: [IP GEO ASN TLS_FINGERPRINT FILE_HASH]
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// The current version of the client list.
        /// </summary>
        [Input("version")]
        public Input<int>? Version { get; set; }

        public ClientlistListState()
        {
        }
        public static new ClientlistListState Empty => new ClientlistListState();
    }
}